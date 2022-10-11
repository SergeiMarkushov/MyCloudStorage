module ru.markush.cloudclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires io.netty.codec;
    requires lombok;
    requires org.slf4j;
    requires CloudCore;


    opens ru.markush.cloudclient to javafx.fxml;
    exports ru.markush.cloudclient;
    exports ru.markush.cloudclient.controllers;
    opens ru.markush.cloudclient.controllers to javafx.fxml;
}