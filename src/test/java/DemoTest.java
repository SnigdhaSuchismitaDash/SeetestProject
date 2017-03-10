
//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
 *
*/
public class DemoTest {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\738522\\workspace\\project2";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "Allianz");
    }

    @Test
    public void testAllianz(){
    	//Changes---2ndTime
        client.setDevice("ios_app:mobility's iPhone");
        client.launch("safari:https://www.allianz.de", true, false);
        client.sleep(2000);
        if(client.waitForElement("WEB", "xpath=//*[@text='Mehr Informationen']", 0, 120000)){
            // If statement
        }
        client.sleep(6000);
        client.click("WEB", "xpath=//*[@text='Mehr Informationen']", 0, 1, 417, 993);
        if(client.waitForElement("WEB", "xpath=//*[@text='Jetzt berechnen' and @nodeName='SPAN' and @width>0]", 0, 120000)){
            // If statement
        }
        client.sleep(10000);
        client.click("WEB", "xpath=//*[@text='Jetzt berechnen' and @nodeName='SPAN' and @width>0]", 0, 1);
        client.sleep(10000);
        if(client.waitForElement("WEB", "xpath=//*[@text='1. Pers�nliche Daten']", 0, 30000)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@name='birthdate_day']", 0, 1);
        if(client.elementSwipeWhileNotFound("NATIVE", "xpath=(//*[@class='UIAPicker']/*[@class='UIAPickerWheel'])[2]", "Up", 400, 2000, "TEXT", "January", 0, 100, 20, true)){
            // If statement
        }
        //client.click("TEXT", "January", 0, 1);
        if(client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@class='UIAPickerWheel']", "Down", 400, 2000, "TEXT", "31", 0, 1000, 20, true)){
            // If statement
        }
        client.click("Allianz", "one", 0, 1);
        if(client.elementSwipeWhileNotFound("NATIVE", "xpath=(//*[@class='UIAPicker']/*[@class='UIAPickerWheel'])[3]", "Up", 400, 2000, "TEXT", "1988", 0, 100, 20, true)){
            // If statement
        }
        client.click("NATIVE", "xpath=//*[@text='Done']", 0, 1);
        client.sleep(1000);
        client.dragDrop("WEB", "xpath=//*[@text='Mein Beruf']", 0, "xpath=//*[@text='Mein Geburtsdatum']", 0);
        client.click("WEB", "xpath=//*[@name='profession_display']", 0, 1);
        client.sleep(2000);
        client.click("WEB", "xpath=//*[@name='profession_search']", 0, 1);
        client.click("WEB", "xpath=//*[@name='profession_display']", 0, 1);
        client.sleep(2000);
        client.click("WEB", "xpath=//*[@name='profession_search']", 0, 1);
        client.sendText("eng");
        client.click("WEB", "xpath=//*[@text='Bauspler(in)']", 0, 1);
        client.click("WEB", "xpath=//*[@name='versicherungsbeginn_value']", 1, 1);
        client.click("TEXT", "04", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Done']", 0, 1);
        client.dragCoordinates(1229, 1289, 750, 1298, 2000);
        client.drag("WEB", "xpath=//*[@name='alterBeiVersicherungsende_handle_to']", 0, -491, 0);
        client.sleep(1000);
        client.swipe("Down", 180, 500);
        client.sleep(3000);
        client.click("WEB", "xpath=(//*[@nodeName='DIV' and ./parent::*[@nodeName='ZAHLBEITRAG' and ./parent::*[./parent::*[./parent::*[@name='schnellrechnerForm']]]]]/*/*[@text and @nodeName='A' and @width>0 and ./parent::*[@nodeName='DIV']])[3]", 0, 1);
    }

    @After
    public void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
        client.generateReport(false);
        // Releases the client so that other clients can approach the agent in the near future. 
        client.releaseClient();
    }
}
