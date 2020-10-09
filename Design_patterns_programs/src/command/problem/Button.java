package command.problem;

public class Button {
    private String label;

    public void click(){
        // .. the code that we implement here, will be dependent on where we use this Button.
        // For Example, on one dialog box, with user click the button you want to save the data to the database.
        // Some where else we have another button, with user clicks the button perhaps he want to delete a record.
        // So, at the time of designing this framework, at the time of implementing the button class.
        // We don't know what code to be executed when we click a button.
        // The command Pattern aims to solve this problem.
        // But before we gonna talk abut the command pattern, Think about the best suitable concept from OOPS concept.
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
