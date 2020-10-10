package template;

import template.implementation.GenerateReportTask;
import template.implementation.TransferMoneyTask;

public class MainTemplateImp {
    public static void main(String[] args){
        var task = new TransferMoneyTask();
        task.execute();
        var task1 = new GenerateReportTask();
        task1.execute();
    }
}
