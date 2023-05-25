package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Basic extends BaseClass{
	
	
	

	@Given("user with valid credentials they login to setup")
	public void userWithValidCredentialsTheyLoginToSetup() throws InterruptedException, FindFailed, IOException {
		
///////////////////////Installation part/////////////////////////////////////////
		
Screen screen = new Screen();


App Solsta = new App("C:\\Users\\DCKLP-037\\Desktop\\Solsta\\solsta_installer-1.2.23.exe");
Solsta.open();
Thread.sleep(5000L);


screen.wait(System.getProperty("user.dir") + "\\Images\\Default.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\English.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\EnglishDropdown.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Default1.png", 5).click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Next.png", 5).click();
Thread.sleep(2000);

try {

// image of the disabled element
String disabledElementImagePath = "C:\\Users\\DCKLP-037\\eclipse-workspace\\Test\\Images\\DisabledButton.png";
Pattern disabledElementPattern = new Pattern(disabledElementImagePath);

// disabled element on the screen
if (screen.exists(disabledElementPattern) != null) {
	System.out.println("Disabled functionality found.");
	// additional verification or actions
} else {
	System.out.println("Disabled functionality not found.");
}
} catch (Exception e) {
e.printStackTrace();
}

screen.wait(System.getProperty("user.dir") + "\\Images\\Back.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Next.png", 5).click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Accept.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Next.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Browse.png", 5).click();
Thread.sleep(2000);

//make a new folder
screen.wait(System.getProperty("user.dir") + "\\Images\\MakeNewFolder.png", 5).click();
Thread.sleep(2000);





//screen.wait(System.getProperty("user.dir") + "\\Images\\SolstaFolder.png", 5).click();
//Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Ok.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Next.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Pause.png", 5).click();
Thread.sleep(3000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Resume.png", 5).click();
Thread.sleep(40000);



screen.wait(System.getProperty("user.dir") + "\\Images\\Launch.png", 5).click();
						
Thread.sleep(8000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Maximize.png", 5).click();
screen.wait(System.getProperty("user.dir") + "\\Images\\Close.png", 5).click();


///////////////Installation part/////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////



String[] command = { "cmd.exe", "/c", "start" };
ProcessBuilder probuilder = new ProcessBuilder(command);
//probuilder.directory(new File("C:\\Users\\DCKLP-037\\Desktop\\Solsta"));
probuilder.directory(new File("C:\\Users\\DCKLP-037\\Desktop\\New folder"));

//need to change the directory name if we click any other folders
Process process = probuilder.start();
Thread.sleep(2000);
Screen screenNew = new Screen();
String commandNew = "solsta.exe --env=qa"; // Replace with your desired command
screenNew.type(commandNew);
screenNew.type("\n");



Thread.sleep(5000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Maximize.png", 5).click();
Thread.sleep(2000);

Match m1 = screen.find(System.getProperty("user.dir") + "\\Images\\SolstaLogoQa.png");
String SolstaLogo = m1.text();
System.out.println("Logo: " + SolstaLogo);


           

// checking with wrong organization name

screen.wait(System.getProperty("user.dir") + "\\Images\\OrgName.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Organization.png", 5).type("testcheck");
screen.wait(System.getProperty("user.dir") + "\\Images\\ContinueQa.png", 5).click();
Thread.sleep(2000);
Match m3 = screen.find(System.getProperty("user.dir") + "\\Images\\InvalidOrg.png");
Thread.sleep(4000);
String Alert1 = m3.text();
System.out.println("Alert popup: " + Alert1);
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\OrgName1.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\OrgName2.png", 5).type("qaoncloud");
screen.wait(System.getProperty("user.dir") + "\\Images\\ContinueQa.png", 5).click();
Thread.sleep(2000);

// entering incorrect credentials

screen.wait(System.getProperty("user.dir") + "\\Images\\EmailNew.png", 5).click();
// Thread.sleep(5000);
screen.wait(System.getProperty("user.dir") + "\\Images\\EmailAddress.png", 5).type("abcdefg");
screen.wait(System.getProperty("user.dir") + "\\Images\\password.png", 2).click();
screen.wait(System.getProperty("user.dir") + "\\Images\\passwordNew.png", 2).type("1233444");

screen.wait(System.getProperty("user.dir") + "\\Images\\showpassword.png").click();
// check here
screen.wait(System.getProperty("user.dir") + "\\Images\\QaContinue.png").click();
Thread.sleep(5000);
Match m4 = screen.find(System.getProperty("user.dir") + "\\Images\\Wcred.png");
String incorrectMessage = m4.text();
System.out.println("Incorrect Message: " + incorrectMessage);
String expectedIM = "Wrong email or password";
String actualIM = incorrectMessage;
// Assert.assertEquals(expectedIM, actualIM);
System.out.println("Assert.assertEquals(" + expectedIM + ", " + actualIM + ")");

// forgot password

screen.wait(System.getProperty("user.dir") + "\\Images\\Forgot.png").click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\EmailNew.png", 5).click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\EmailAddress.png", 5)
	.type("abcd");
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\QaContinue.png").click();
Thread.sleep(2000);
Match Email = screen.find(System.getProperty("user.dir") + "\\Images\\NotValidEmail.png");
String validCheck = Email.text();
System.out.println("Incorrect Message: " + validCheck);
String expectedVc = "Email is not valid";
String actualVc = validCheck;
// Assert.assertEquals(expectedIM, actualIM);
System.out.println("Assert.assertEquals(" + expectedVc + ", " + actualVc + ")");


screen.wait(System.getProperty("user.dir") + "\\Images\\Back2qa.png", 5).click();
Thread.sleep(2000);

// correct credentials
screen.wait(System.getProperty("user.dir") + "\\Images\\EmailNew.png", 5).click();
// Thread.sleep(5000);
screen.wait(System.getProperty("user.dir") + "\\Images\\EmailAddress.png", 5)
	.type("solstaqa+qaoncloud@solidstatenetworks.com");
screen.wait(System.getProperty("user.dir") + "\\Images\\password.png", 2).click();
screen.wait(System.getProperty("user.dir") + "\\Images\\passwordNew.png", 2).type("R7DzgN2.LGwCEViP");

// screen.wait(System.getProperty("user.dir")+"\\Images\\showpassword.png").click();

screen.wait(System.getProperty("user.dir") + "\\Images\\QaContinue.png").click();
Thread.sleep(15000);

/////////////////////////////////environment //////////////////////////////////////////
screen.wait(System.getProperty("user.dir") + "\\Images\\Matrix.png").click();
Thread.sleep(5000);
screen.wait(System.getProperty("user.dir") + "\\Images\\dev.png").click();
Thread.sleep(5000);

screen.wait(System.getProperty("user.dir") + "\\Images\\InstallEnv.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\CancelMatrix.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\InstallEnv.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Browse1.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\MakeNewFolder.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Ok.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Install.png").click();
Thread.sleep(15000);

/*screen.wait(System.getProperty("user.dir") + "\\Images\\Pause1.png",10).click();
Thread.sleep(5000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Resume1.png",10).click();
Thread.sleep(5000);
*/
screen.wait(System.getProperty("user.dir") + "\\Images\\DevBug.png",10).click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\CloseNotepad.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Calculate.png").click();
Thread.sleep(2000);


screen.wait(System.getProperty("user.dir") + "\\Images\\2.png").click();
Thread.sleep(2000);



screen.wait(System.getProperty("user.dir") + "\\Images\\Mul.png").click();
Thread.sleep(2000);


screen.wait(System.getProperty("user.dir") + "\\Images\\8.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Equal2.png").click();
Thread.sleep(2000);


Match m5 = screen.find(System.getProperty("user.dir") + "\\Images\\CalOutput.png");
Thread.sleep(4000);
String Output = m5.text();
System.out.println("Calculator Output: " + Output);

screen.wait(System.getProperty("user.dir") + "\\Images\\CalClose.png").click();
Thread.sleep(2000);


screen.wait(System.getProperty("user.dir") + "\\Images\\More.png").click();
Thread.sleep(2000);

screen.wait(System.getProperty("user.dir") + "\\Images\\Signout.png").click();
Thread.sleep(2000);
screen.wait(System.getProperty("user.dir") + "\\Images\\Close.png", 5).click();


//screen.wait(System.getProperty("user.dir") + "\\Images\\").click();
//Thread.sleep(2000);

// pause time resume time  cal output -differ image

		
		

	
	}
	@When("user validate the application for execution")
	public void userValidateTheApplicationForExecution() {
		
		

	
	}
	@Then("user logout the application")
	public void userLogoutTheApplication() {
		
		

	
	}




}
