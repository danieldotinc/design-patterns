package com.codewithmosh;


import com.codewithmosh.chainOfResponsibility.*;
import com.codewithmosh.chainOfResponsibility.Number;
import com.codewithmosh.command.course.AddCustomerCommand;
import com.codewithmosh.command.course.CallCustomerCommand;
import com.codewithmosh.command.course.CustomerService;
import com.codewithmosh.command.course.editor.BoldCommand;
import com.codewithmosh.command.course.editor.History;
import com.codewithmosh.command.course.editor.HtmlDocument;
import com.codewithmosh.command.course.editor.UndoCommand;
import com.codewithmosh.command.course.fx.Button;
import com.codewithmosh.command.course.fx.CompositeCommand;
import com.codewithmosh.iterator.Iterator;
import com.codewithmosh.iterator.Product;
import com.codewithmosh.iterator.ProductCollection;
import com.codewithmosh.iterator.course.BrowseHistory;
import com.codewithmosh.mediator.SignUpDialogBox;
import com.codewithmosh.mediator.course.ArticleDialogBox;
import com.codewithmosh.mediator.course.observer.ArticleEventHandler;
import com.codewithmosh.memento.DocHistory;
import com.codewithmosh.memento.Document;
import com.codewithmosh.observer.StatusBar;
import com.codewithmosh.observer.Stock;
import com.codewithmosh.observer.StockListView;
import com.codewithmosh.observer.course.pull.PullChart;
import com.codewithmosh.observer.course.pull.PullDataSource;
import com.codewithmosh.observer.course.pull.PullSpreadSheet;
import com.codewithmosh.observer.course.push.PushChart;
import com.codewithmosh.observer.course.push.PushDataSource;
import com.codewithmosh.observer.course.push.PushSpreadSheet;
import com.codewithmosh.state.*;
import com.codewithmosh.state.course.Canvas;
import com.codewithmosh.state.course.SelectionIcon;
import com.codewithmosh.strategy.AESEncrypt;
import com.codewithmosh.strategy.ChatClient;
import com.codewithmosh.strategy.DESEncrypt;
import com.codewithmosh.strategy.course.*;
import com.codewithmosh.template.VSCodeWin;
import com.codewithmosh.template.course.GenerateReportTask;
import com.codewithmosh.template.course.MoneyTransferTask;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //execMementoPattern();
        execStatePattern();
        //execIteratorPattern();
        //execStrategyPattern();
        //execTemplatePattern();
        //execCommandPattern();
        //execObserverPattern();
        //execMediatorPattern();
        //execChainOfResponsibility();
    }

    private static void execChainOfResponsibility() {
        DataReader dataReader = new DataReader(
                new Excel(new Number(new QuickBook(
                        new NotSupportedData(null)))));

        dataReader.read("account.qbw");
        dataReader.read("account.numbers");
        dataReader.read("account.xls");
        dataReader.read("account.jpg");

    }

    private static void execMediatorPattern() {
        //course
        ArticleDialogBox dialogBox = new ArticleDialogBox();
        dialogBox.simulateUserInteraction();

        //MediatorPattern using observer
        ArticleEventHandler eventHandler = new ArticleEventHandler();
        eventHandler.simulateUserInteraction();

        //exercise
        SignUpDialogBox dialogBox1 = new SignUpDialogBox();
        dialogBox1.simulateUserInteraction();

    }

    private static void execObserverPattern() {
        //push style
        PushDataSource pushDataSource = new PushDataSource();
        pushDataSource.registerObserver(new PushSpreadSheet());
        pushDataSource.registerObserver(new PushChart());
        pushDataSource.setValue(2);

        //pull style
        PullDataSource pullDataSource = new PullDataSource();
        pullDataSource.registerObserver(new PullSpreadSheet(pullDataSource));
        pullDataSource.registerObserver(new PullChart(pullDataSource));
        pullDataSource.setValue(2);

        //exercise
        Stock appl = new Stock("APPL",2400);
        Stock googl = new Stock("GOOGL",2210);
        Stock amzn = new Stock("AMZN",2340);

        StatusBar statusBar = new StatusBar();
        StockListView listView = new StockListView();

        appl.registerObserver(statusBar);
        appl.registerObserver(listView);

        googl.registerObserver(statusBar);
        googl.registerObserver(listView);

        amzn.registerObserver(statusBar);
        amzn.registerObserver(listView);

        statusBar.addStock(appl);
        statusBar.addStock(googl);
        statusBar.addStock(amzn);

        listView.addStock(appl);
        listView.addStock(googl);
        listView.addStock(amzn);

        statusBar.show();
        listView.show();

        appl.setPrice(2150);
    }

    private static void execCommandPattern() {
        CustomerService service = new CustomerService();
        AddCustomerCommand addCustomer = new AddCustomerCommand(service);
        CallCustomerCommand callCustomer = new CallCustomerCommand(service);
        Button button1 = new Button(addCustomer);
        button1.click();

        // executing multiple commands
        CompositeCommand commands = new CompositeCommand();
        commands.addCommand(addCustomer);
        commands.addCommand(callCustomer);

        Button button2 = new Button(commands);
        button2.click();

        // executing undoable command
        History history = new History();
        HtmlDocument document = new HtmlDocument("Daniel");

        BoldCommand boldCommand = new BoldCommand(document,history);
        UndoCommand undoCommand = new UndoCommand(history);

        boldCommand.execute();
        System.out.println(document.getContent());

        undoCommand.execute();
        System.out.println(document.getContent());

    }

    public static void execTemplatePattern(){
        VSCodeWin vsCodeWin = new VSCodeWin();
        vsCodeWin.close();

        //course practice
        MoneyTransferTask moneyTransferTask = new MoneyTransferTask();
        moneyTransferTask.execute();

        GenerateReportTask generateReportTask = new GenerateReportTask();
        generateReportTask.execute();

    }

    public static void execStrategyPattern(){
        ChatClient chatClient = new ChatClient(new AESEncrypt());
        chatClient.send("ABC");

        ChatClient chatClient1 = new ChatClient(new DESEncrypt());
        chatClient1.send("ABC");

        //course practice
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("Image1",new PNGCompression(), new BlackAndWhiteFilter());
        imageStorage.store("Image1",new JPEGCompress(), new HighContrastFilter());
    }

    public static void execStatePattern(){
        DirectionService walking = new DirectionService(new Walking());
        System.out.println(walking.getDirection());
        System.out.println(walking.getEta());


        DirectionService bicycling = new DirectionService(new Bicycling());
        System.out.println(bicycling.getDirection());
        System.out.println(bicycling.getEta());

        DirectionService transit = new DirectionService(new Transit());
        System.out.println(transit.getDirection());
        System.out.println(transit.getEta());

        DirectionService driving = new DirectionService(new Driving());
        System.out.println(driving.getDirection());
        System.out.println(driving.getEta());

        //Course practice
        Canvas canvas = new Canvas(new SelectionIcon());
        canvas.mouseUp();
        canvas.mouseDown();

    }

    public static void execIteratorPattern(){
        Product product1 = new Product(1,"Wallet");
        Product product2 = new Product(2,"Belt");
        ProductCollection productCollection = new ProductCollection();
        productCollection.push(product1);
        productCollection.push(product2);

        Iterator iterator = productCollection.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current().toString());
            iterator.next();
        }

        //course practice
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        com.codewithmosh.iterator.course.Iterator itr = browseHistory.createIterator();
        while (itr.hasNext()){
                System.out.println(itr.getCurrent());
                iterator.next();
        }
    }


    public static void execMementoPattern(){
        Document document = new Document();
        DocHistory docHistory = new DocHistory();

        // First State
        document.setContent("Daniel");
        document.setFontName("Sans");
        document.setFontSize(12);
        docHistory.push(document.createState());

        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

        // Second State
        document.setContent("Dani");
        document.setFontName("MRT");
        document.setFontSize(14);
        docHistory.push(document.createState());

        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

        document.setFontSize(13);
        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

        System.out.println("undo ...");
        document.restoreState(docHistory.pop());
        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());


        System.out.println("undo ...");
        document.restoreState(docHistory.pop());
        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

    }
}
