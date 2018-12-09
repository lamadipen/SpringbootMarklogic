package com.dl.ml.repository;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.document.TextDocumentManager;
import com.marklogic.client.io.StringHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookRepository {

    @Autowired
    DatabaseClient markLogicDbClient;

    public void saveBook(){

        TextDocumentManager docMgr = markLogicDbClient.newTextDocumentManager();


        String docId = "/example/text.txt";


        StringHandle handle = new StringHandle();

        handle.set("A simple text document");

        docMgr.write(docId, handle);

        markLogicDbClient.release();
    }


}
