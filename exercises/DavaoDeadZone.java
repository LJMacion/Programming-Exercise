import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class DavaoDeadZone extends Application {

    private Stage window;
    private BorderPane layout;
    private Label titleNameLabel, mainTextLabel, hpLabel, weaponLabel;
    private Button startButton, choice1, choice2, choice3, choice4;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Davao Dead Zone");

        // Title Label
        titleNameLabel = new Label("Davao Dead Zone");
        titleNameLabel.setFont(Font.font("Verdana", 50));
        titleNameLabel.setTextAlignment(TextAlignment.CENTER);

        // Start Button
        startButton = new Button("START");
        startButton.setOnAction(e -> createGameScreen());

        // Title Panel
        VBox titlePanel = new VBox(20);
        titlePanel.setAlignment(Pos.CENTER);
        titlePanel.getChildren().addAll(titleNameLabel, startButton);

        layout = new BorderPane();
        layout.setCenter(titlePanel);
        Scene scene = new Scene(layout, 800, 600);
        window.setScene(scene);
        window.show();
    }

    public void createGameScreen() {
        titleNameLabel.setVisible(false);
        startButton.setVisible(false);

        // Main Text Label
        mainTextLabel = new Label("In the heart of the Philippines lies the bustling city of Davao, once a vibrant metropolis known for its rich culture and thriving economy. However, a mysterious outbreak has plunged the city into chaos, turning its streets into a nightmarish battleground overrun by hordes of the undead.\n\nAs one of the few survivors left in Davao, you must navigate through the city's dangerous streets and surrounding areas, each teeming with dangers and opportunities for survival. Your choices will determine not only your fate but also the fate of those around you and the future of Davao itself");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);

        // Choice Buttons
        choice1 = new Button("Proceed to the City");
        choice1.setOnAction(e -> FirstScene());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);
    }
    //first scene
    public void FirstScene() {
        mainTextLabel = new Label("SCAVENGING FOR SUPPLIES\n\nYou are low on supply, it is important to stock up on resources to help you navigate through this hellish predicament. You know 2 areas which has resources for you to scavenge, which area would you go to?\n\nOption A: **Scavenge in Roxas**: Head to the Roxas streets, known for its markets and shops. It's risky due to the dense population of zombies attracted to the noise, but there are potentially valuable supplies to be found.\n\nOption B: **Scavenge in Obrero**: Explore the quieter streets of Obrero, where the outbreak may not have spread as rapidly. While there may be fewer resources, it's also less dangerous.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button("Option A");
        choice2 = new Button("Option B");
        choice1.setOnAction(e -> SceneDone1F());
        choice2.setOnAction(e -> SceneDone1W());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1, choice2);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //win outcome
     public void SceneDone1W() {
        mainTextLabel = new Label("Congratulations! Despite the risks of low resources, you bravely ventured into the quieter streets of the Obrero district. There you found valuable supplies awaited amidst the abandoned houses and shops. Your quick thinking and resourcefulness allowed you to gather essential provisions, fortifying your chances of survival in the unforgiving Deadzone");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button(">>>");
        choice1.setOnAction(e -> SecondScene());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //failed outcome
    public void SceneDone1F() {
        mainTextLabel = new Label("You got bitten! Opting for the bustling streets of Roxas seemed like a wise choice, but the dense population and greater number of infected ultimately hindered your ability to gather essential supplies. As you scoured the streets, you found yourself swarmed by numerous infected and got bitten.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
    // change bg color to red(?)        layout.setStyle("-fx-background-color: #ff0000;");

        
        Button endButton = new Button("Close Game");
        endButton.setOnAction(e -> window.close());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(endButton);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }

     // second scene (shelter)
     public void SecondScene() {
        mainTextLabel = new Label("FINDING SHELTER\n\nIt is essential to set up a base camp where resources can easily be found and where infected people are less grouped up. Thinking about it, 2 locations come into mind, which area would you go to?\n\nOption A: **Fortify in Buhangin**: Find a sturdy building in Buhangin to fortify against the zombie horde. It's a strategic location with fewer zombies and access to resources, but it may attract attention from other survivors.\n\nOption B: **Seek refuge in Sasa**: Head to the outskirts of Sasa, where the rural areas offer isolation from the undead. However, resources may be scarce, and you'll need to rely on your survival skills to endure.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button("Option A");
        choice2 = new Button("Option B");
        choice1.setOnAction(e -> Scene2DoneW());
        choice2.setOnAction(e -> Scene2DoneF());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1, choice2);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //win outcome scene 2
    public void Scene2DoneW() {
        mainTextLabel = new Label("You wisely chose to fortify a sturdy building in the strategic location of Buhangin, where the density of zombies was lower, and access to resources was more manageable. Your fortified stronghold became a beacon of hope amidst the chaos, providing safety and security for you and your allies.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button(">>>");
        choice1.setOnAction(e -> ThirdScene());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //failed outcome
    public void Scene2DoneF() {
        mainTextLabel = new Label("While the rural areas of Sasa offered isolation from the undead, the scarcity of resources and the harsh conditions of survival took their toll. Despite your best efforts, you struggled to endure in the unforgiving wilderness");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
    // change bg color to red(?)        layout.setStyle("-fx-background-color: #ff0000;");
  
        Button endButton = new Button("Close Game");
        endButton.setOnAction(e -> window.close());
        
        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(endButton);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    
     // third scene (Forming Alliances)
     public void ThirdScene() {
        mainTextLabel = new Label(
            "FORMING ALLIANCES\n\nAs days stretch into an endless expanse of uncertainty, you find yourself enveloped by the eerie silence of the Deadzone, where every shadow whispers of danger and every moment is a delicate dance between survival and despair. Amidst the desolation, a singular thought echoes in the corridors of your mind like a haunting refrain: the notion of companionship, of having survivors by your side in this forsaken realm." +
            "\n\nIn the quiet moments between scavenging for supplies and fortifying your shelter, you ponder the significance of forming alliances amidst the chaos. The weight of solitude bears heavy upon your shoulders, a constant reminder of the fragility of existence in this unforgiving landscape. And yet, as the sun sets on another day of relentless struggle, the flicker of hope ignites within your heart—a hope kindled by the possibility of finding solace in the company of others. What shall you do?" +
            "\n\nOption A: **Stay Solo**: Choose to remain independent and avoid entanglements with other survivors. While this reduces the risk of betrayal, it also means facing the challenges of the Deadzone alone."+
            "\n\nOption B: **Recruit in Panacan**: Seek out other survivors in Panacan and form alliances to increase your chances of survival. Strength in numbers can provide protection against the undead, but trust must be earned.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button("Option A");
        choice2 = new Button("Option B");
        choice1.setOnAction(e -> Scene3DoneF());
        choice2.setOnAction(e -> Scene3DoneW());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1, choice2);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //win outcome scene 3
    public void Scene3DoneW() {
        mainTextLabel = new Label("Seeking out other survivors in Panacan, you formed alliances that proved invaluable in the fight against the undead. Strength in numbers became your greatest asset, as trust and camaraderie prevailed amidst the devastation of the Deadzone.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button(">>>");
        choice1.setOnAction(e -> FourthScene());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //failed outcome
    public void Scene3DoneF() {
        mainTextLabel = new Label("Choosing to remain independent meant facing the challenges of the Deadzone alone. Without the support of allies, you found yourself overwhelmed by the relentless onslaught of the undead, unable to withstand the odds stacked against you.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
    // change bg color to red(?)        layout.setStyle("-fx-background-color: #ff0000;");
  
        Button endButton = new Button("Close Game");
        endButton.setOnAction(e -> window.close());
        
        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(endButton);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);
     } 
     
     // fourth scene (Facing the Unknown)
     public void FourthScene() {
        mainTextLabel = new Label(
            "FACING THE UNKOWN\n\nAs the days drag on in the unforgiving landscape of the Deadzone, you find yourself confronted with a daunting decision: to either cling to the familiarity of the city's crumbling streets or to embark on a perilous journey into the untamed wilderness of Lasang" +
            "\n\nAs you weigh the risks and rewards of each option, the sun dips below the horizon, casting long shadows over the decaying remnants of civilization. In the fading light, the decision looms large before you: to cling to the safety of the known or to embrace the uncertainty of the unknown. Whatever path you choose, one thing remains certain—the journey ahead will test not only your strength and resilience but also your willingness to confront the mysteries that lie beyond the safety of the city walls.. What shall you do?" +
            "\n\nOption A: **Stay Grounded**: Maintain a low profile and stay within the familiar territory of the city. While safer in the short term, it may limit your long-term survival options."+
            "\n\nOption B: **Explore Lasang**: Venture into the wilderness of Lasang in search of untouched resources and potential sanctuary. It's a gamble with unknown dangers lurking in the wilderness.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button("Option A");
        choice2 = new Button("Option B");
        choice1.setOnAction(e -> Scene4DoneF());
        choice2.setOnAction(e -> Scene4DoneW());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1, choice2);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //win outcome scene 4
    public void Scene4DoneW() {
        mainTextLabel = new Label("Venturing into the wilderness of Lasang proved to be a gamble worth taking as you discovered untouched resources and potential sanctuary away from the relentless hordes of zombies. Your bold exploration expanded your survival options and provided a glimmer of hope in the darkest of times.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button(">>>");
        choice1.setOnAction(e -> FifthScene());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //failed outcome
    public void Scene4DoneF() {
        mainTextLabel = new Label(
            "In the lingering shadows of the city's ruins, you opted to Stay Grounded, seeking solace in the familiarity of the decaying streets and crumbling buildings. While this choice offered a semblance of safety in the short term, it ultimately proved to be a fatal misstep in your journey through the Deadzone."+
            "\n\nDays turned into weeks, and weeks into months, yet despite your best efforts to fortify your position within the city, the relentless advance of the undead could not be halted. With each passing day, resources dwindled, and hope faded like a dying ember in the cold night.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
    // change bg color to red(?)        layout.setStyle("-fx-background-color: #ff0000;");
  
        Button endButton = new Button("Close Game");
        endButton.setOnAction(e -> window.close());
        
        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(endButton);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);
     }
     // Fifth scene (Confronting the Threat)
     public void FifthScene() {
        mainTextLabel = new Label(
            "CONFRONTING THE THREAT\n\nAs the relentless march of time wears on, the looming specter of the outbreak's origin hangs heavy in the air, casting a long shadow over the beleaguered city of Davao. With the fate of both survivors and the remnants of civilization teetering on a knife's edge, you stand at a pivotal crossroads, faced with a choice that will shape the course of the Deadzone's future." +
            "\n\nAs you weigh the risks and rewards of each option, the weight of the decision bears down upon you like a heavy burden. In the end, the choice is yours alone to make a testament to your resilience and determination in the face of unimaginable adversity. Whatever path you choose, one thing remains certain, the fate of Davao and its inhabitants hangs in the balance, awaiting the outcome of your final, fateful decision." +
            "\n\nOption A: **Confront the Source**: Investigate rumors of a research facility in Davao where the outbreak may have originated. Confronting the source could lead to a cure or valuable information but is fraught with danger."+
            "\n\nOption B: **Survive and Evade**: Focus on survival and evasion, avoiding confrontation with the source of the outbreak. While less risky, this approach may prolong the suffering of Davao and its inhabitants.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button("Option A");
        choice2 = new Button("Option B");
        choice1.setOnAction(e -> Scene5DoneW());
        choice2.setOnAction(e -> Scene5DoneF());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1, choice2);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //win outcome scene 4
    public void Scene5DoneW() {
        mainTextLabel = new Label("Investigating rumors of a research facility in Davao, you confronted the source of the outbreak head on, risking everything for the chance of finding a cure. Your bravery and determination paid off as you uncovered vital information that paved the way for humanity's triumph over the zombie menace.");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
        
        choice1 = new Button(">>>");
        choice1.setOnAction(e -> WinScene());

        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(choice1);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);

    }
    //failed outcome
    public void Scene5DoneF() {
        mainTextLabel = new Label(
            "Focusing solely on survival and evasion may have spared you from immediate danger, but it also prolonged the suffering of Davao and its inhabitants. As you evaded confrontation with the source of the outbreak, hope dwindled, and the city fell deeper into despair."+
            "\n\nAs darkness descends upon the desolate streets of Davao, your journey serves as a grim reminder of the harsh realities of survival in the Deadzone. Despite your best efforts, the odds were simply too great, and the city remains overrun by the undead. Your story ends here, a tragic casualty of the Davao Deadzone");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
    // change bg color to red(?)        layout.setStyle("-fx-background-color: #ff0000;");
  
        Button endButton = new Button("Close Game");
        endButton.setOnAction(e -> window.close());
        
        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(endButton);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);
     }
     public void WinScene() {
        mainTextLabel = new Label(
            "**As the sun rises over the reclaimed streets of Davao, you stand as a symbol of resilience and courage, leading the survivors towards a brighter future. The city may have been ravaged by the undead, but through your unwavering determination and strategic decisions, hope has emerged from the ashes. Congratulations on your victory in the Davao Deadzone!**"+
            "\n\nThank you for Playing the Game!");
        mainTextLabel.setWrapText(true);
        mainTextLabel.setFont(Font.font("Verdana", 20));
        mainTextLabel.setTextAlignment(TextAlignment.CENTER);
  
        Button endButton = new Button("To be continued...");
        endButton.setOnAction(e -> window.close());
        
        VBox choiceButtons = new VBox(10);
        choiceButtons.getChildren().addAll(endButton);
        choiceButtons.setAlignment(Pos.CENTER);

        layout.setTop(mainTextLabel);
        layout.setCenter(choiceButtons);
     }
}
