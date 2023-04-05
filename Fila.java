public class Fila {
    private static Fila instance = null;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    private Fila(){

    }

    public static Fila getInstance()
    {
        if (instance == null)
            instance = new Fila();

        return instance;
    }


    public void imprimeDocumento(){
        return;
    }

    public void RemoveDocumento(){
        return;
    }

    public void RemoveTodosDocumento(){
    return;
    }

}

