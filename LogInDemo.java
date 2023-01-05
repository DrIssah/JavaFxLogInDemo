package logindemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//dont mind the backgroud music, its the only one i have bro!!!! 
//so lets start by creating a method here
//this method will create the log in window
// i dont want to make things complex, if you have any question
//then you will inbox me
//lol first mistake, outsde class!!!! dont get trapped
//so it has top, left center... bla bla bla
//ok back to out app
//also we can use other layout, we have diffrent layouts
//ok lets continue, 
//ok borderpane is used in javafx while borderlayout is for swing, 
// so guys there we go!!!!!!!!
//if you need this simple app, visit my site
//to be given letter, for now just inbox

public class LogInDemo extends Application {

    public boolean checkUser(String uname, String pass) {
        //in simple terms
        //return uname.equals("admin") && pass.equals("admin");
        //hope you have see the reason why i wrote this code before

        return uname.equals("admin") && pass.equals("admin");

    }

    public BorderPane createWindow() {

        BorderPane b = new BorderPane();

        VBox vb = new VBox();
        vb.setSpacing(5);

        //then lets add a hbox, horizontal box, ok??
        HBox hb = new HBox(); //lay items horizontally
        hb.setSpacing(5);
        //then we need a tex fileld for user name, and label for the text user name
        TextField uname = new TextField();
        Label lbl_uname = new Label("User Name: ");
        lbl_uname.setPrefWidth(150);
        hb.getChildren().add(lbl_uname);
        hb.getChildren().add(uname);
        vb.getChildren().add(hb);

        // ok so we need password field
        //bro, we are solving assignments, so just copy paste lol!!!!!!, timt is money
        //then lets add a hbox, horizontal box, ok??
        HBox hb_pass = new HBox(); //lay items horizontally
        hb_pass.setSpacing(5);
        //then we need a tex fileld for user name, and label for the text user name
        PasswordField upass = new PasswordField();
        Label lbl_upass = new Label("User Password: ");
        lbl_upass.setPrefWidth(150);
        hb_pass.getChildren().add(lbl_upass);
        hb_pass.getChildren().add(upass);

        //notofication label
        Label notfy = new Label("");
        notfy.setPrefWidth(150);
        //wanted to set text alignment, but ignore it, unless you need it so badly!!!

        // now we need a button
        Button btn_login = new Button("Log In");  // whats the error leaner????? ok we already have b lol
        //lets copy code bro, no time
        btn_login.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //for us we get the username and password
                String str_uname = uname.getText();
                String pass = upass.getText();

                //lets make sure the text are not empt
                if (!str_uname.isEmpty() && !pass.isEmpty()) {
                    //WHAT ELSE, COMPARE
                    //if you are using MYSQL then we just connect to server and check if user exist, ok??
                    //but here is a demo so no need, lets check if password matct with our own
                    boolean reasult = checkUser(str_uname, pass);

                    // ok lets add a label to notify a user that the password is correct or wrong
                    if (reasult) {  //handles if true
                        notfy.setText("Correct username and password");
                    } else {

                        notfy.setText("Wrong information bro!!!");

                    }
                }else{
                
                        notfy.setText("Please enter user name and password!!!");

                
                }

                //lol we didnt add the buttton and the label,
                //where do we need to add them??? hay think man, think!!!
            }
        });

        //lol we need a VBox now, you now y? look,
        //if we add a the new hbox, we will overite the other one, so lets use
        //vbox to arrange the hboxes horizontally
        vb.getChildren().add(hb_pass);
        vb.getChildren().add(btn_login);
        vb.getChildren().add(notfy);

        //we will return the layout with the components
        b.setCenter(vb);

        //but for real it does not look pretty!!! right????
        return b;

    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        BorderPane main = createWindow();

        Scene scene = new Scene(main, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
