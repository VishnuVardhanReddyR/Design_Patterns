package template.implementation;

public class TransferMoneyTask extends Task {

        //So just like 'this' references to the current object,
        // Super references to the parent object.

    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
