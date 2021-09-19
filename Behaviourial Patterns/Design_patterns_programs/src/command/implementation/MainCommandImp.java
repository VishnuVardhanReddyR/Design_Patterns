package command.implementation;

import command.implementation.fx.Button;

public class MainCommandImp {
    public static void main(String[] args){
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
