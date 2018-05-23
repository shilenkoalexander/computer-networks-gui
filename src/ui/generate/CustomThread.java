package ui.generate;

import org.donntu.databaseworker.StudentTask;
import org.donntu.drawer.GeneratorDrawer;

import java.util.ArrayList;
import java.util.List;

public abstract class CustomThread extends Thread{
    protected List<StudentTask> tasks;
    protected List<Exception> exceptions = new ArrayList<>();

    @Override
    abstract public void run();

    CustomThread(List<StudentTask> tasks){
        super();
        this.tasks = tasks;
    }

    protected List<Exception> getExceptions() {
        return exceptions;
    }
}
