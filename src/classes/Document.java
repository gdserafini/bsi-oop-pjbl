package classes;

import aux.MyLib;

public abstract class Document {
    private String docNumber;
    private String description;
    private String decision;

    public abstract String getInfo();

    public String getDecision() { return decision; }

    public String getDescription() { return description; }

    public String getDocNumber() { return docNumber; }

    public void setDecision(String decision) {
        if(MyLib.invalidString(decision)) return;
        this.decision = decision;
    }

    public void setDescription(String description) {
        if(MyLib.invalidString(description)) return;
        this.description = description;
    }

    public void setDocNumber(String docNumber) {
        if(MyLib.invalidString(docNumber)) return;
        this.docNumber = docNumber;
    }
}
