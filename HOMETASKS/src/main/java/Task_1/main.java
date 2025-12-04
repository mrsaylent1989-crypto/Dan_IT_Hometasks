package Task_1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        MyBrowser myBrowser = new MyBrowser();
        MyFile myFile = new MyFile();
        List<CanBeClosed> FileBrowser = new ArrayList<>();
        FileBrowser.add(myFile);
        FileBrowser.add(myBrowser);

        SessionClouser lambda = entities -> entities.forEach(CanBeClosed::close);
        lambda.closeSession(FileBrowser);
    }
}
