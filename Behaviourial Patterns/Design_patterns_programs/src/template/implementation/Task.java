package template.implementation;

public abstract class Task {
    private AuditTrial auditTrial;

    public Task() {
        auditTrial = new AuditTrial();
    }


    public void execute(){
        auditTrial.record();
        doExecute();
    }

    protected abstract void doExecute();
}
