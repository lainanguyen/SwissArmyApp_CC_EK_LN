package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class VerseOfTheDay {

    private String[] imagePaths = {
            "/VerseImage1.jpeg",
            "/VerseImage2.jpeg",
            "/VerseImage3.jpeg",
            "/VerseImage4.jpeg",
            "/VerseImage5.jpeg",
            "/VerseImage6.jpeg",
            "/VerseImage7.jpeg",
            "/VerseImage8.jpeg",
            "/VerseImage9.jpeg",
            "/VerseImage10.jpeg",
            "/VerseImage11.jpeg",
            "/VerseImage12.jpeg",
            "/VerseImage13.jpeg",
            "/VerseImage14.jpeg",
            "/VerseImage15.jpeg",
            "/VerseImage16.jpeg",
            "/VerseImage17.jpeg",
            "/VerseImage18.jpeg",
            "/VerseImage19.jpeg",
            "/VerseImage20.jpeg",
            "/VerseImage21.jpeg",
            "/VerseImage22.jpeg",
            "/VerseImage23.jpeg",
            "/VerseImage24.jpeg",
            "/VerseImage25.jpeg",
            "/VerseImage26.jpeg",
            "/VerseImage27.jpeg",
            "/VerseImage28.jpeg",
            "/VerseImage29.jpeg",
            "/VerseImage30.jpeg",
    };

    private String[] verses = {
            "For God so loved the world, that he gave his only Son, that whoever believes in him should not perish but have eternal life. - John 3:16 ESV",
            "Trust in the Lord with all your heart, and do not lean on your own understanding. - Proverbs 3:5 ESV",
            "If we confess our sins, he is faithful and just to forgive us our sins and to cleanse us from all unrighteousness. - 1 John 1:9 ESV",
            "But God shows his love for us in that while we were still sinners, Christ died for us. - Romans 5:8 ESV",
            "And we know that for those who love God all things work together for good, for those who are called according to his purpose. - Romans 8:28 ESV",
            "And he said to them, 'Go into all the world and proclaim the gospel to the whole creation.' - Mark 16:15 ESV",
            "Do not be anxious about anything, but in everything by prayer and supplication with thanksgiving let your requests be made known to God. - Philippians 4:6 ESV",
            "And let us not grow weary of doing good, for in due season we will reap, if we do not give up. - Galatians 6:9 ESV",
            "For by grace you have been saved through faith. And this is not your own doing; it is the gift of God. - Ephesians 2:8 ESV",
            "I have been crucified with Christ. It is no longer I who live, but Christ who lives in me. And the life I now live in the flesh I live by faith in the Son of God, who loved me and gave himself for me. - Galatians 2:20 ESV",
            "Therefore, since we are surrounded by so great a cloud of witnesses, let us also lay aside every weight, and sin which clings so closely, and let us run with endurance the race that is set before us. - Hebrews 12:1 ESV",
            "If we confess our sins, he is faithful and just to forgive us our sins and to cleanse us from all unrighteousness. - 1 John 1:9 ESV",
            "And whatever you do, in word or deed, do everything in the name of the Lord Jesus, giving thanks to God the Father through him. - Colossians 3:17 ESV",
            "Blessed are the peacemakers, for they shall be called sons of God. - Matthew 5:9 ESV",
            "Therefore, if anyone is in Christ, he is a new creation. The old has passed away; behold, the new has come. - 2 Corinthians 5:17 ESV",
            "Let not your hearts be troubled. Believe in God; believe also in me. - John 14:1 ESV",
            "And above all these put on love, which binds everything together in perfect harmony. - Colossians 3:14 ESV",
            "And we have something more sure, the prophetic word, to which you will do well to pay attention as to a lamp shining in a dark place, until the day dawns and the morning star rises in your hearts. - 2 Peter 1:19 ESV",
            "Have I not commanded you? Be strong and courageous. Do not be frightened, and do not be dismayed, for the Lord your God is with you wherever you go. - Joshua 1:9 ESV",
            "I appeal to you therefore, brothers, by the mercies of God, to present your bodies as a living sacrifice, holy and acceptable to God, which is your spiritual worship. - Romans 12:1 ESV",
            "Beloved, let us love one another, for love is from God, and whoever loves has been born of God and knows God. - 1 John 4:7 ESV",
            "Therefore, confess your sins to one another and pray for one another, that you may be healed. The prayer of a righteous person has great power as it is working. - James 5:16 ESV",
            "Let love be genuine. Abhor what is evil; hold fast to what is good. - Romans 12:9 ESV",
            "For the wages of sin is death, but the free gift of God is eternal life in Christ Jesus our Lord. - Romans 6:23 ESV",
            "Count it all joy, my brothers, when you meet trials of various kinds, for you know that the testing of your faith produces steadfastness. - James 1:2-3 ESV",
            "But as for you, O man of God, flee these things. Pursue righteousness, godliness, faith, love, steadfastness, gentleness. - 1 Timothy 6:11 ESV",
            "For I am sure that neither death nor life, nor angels nor rulers, nor things present nor things to come, nor powers, nor height nor depth, nor anything else in all creation, will be able to separate us from the love of God in Christ Jesus our Lord. - Romans 8:38-39 ESV",
            "Blessed is the man who remains steadfast under trial, for when he has stood the test he will receive the crown of life, which God has promised to those who love him. - James 1:12 ESV",
            "And the Word became flesh and dwelt among us, and we have seen his glory, glory as of the only Son from the Father, full of grace and truth. - John 1:14 ESV",
            "Let the word of Christ dwell in you richly, teaching and admonishing one another in all wisdom, singing psalms and hymns and spiritual songs, with thankfulness in your hearts to God. - Colossians 3:16 ESV",
    };

    @FXML
    private ImageView verseImage;

    @FXML
    private Label verseLabel;

    @FXML
    public void initialize() {
        Random random = new Random();
        int imageIndex = random.nextInt(imagePaths.length);
        int verseIndex = random.nextInt(verses.length);

        verseImage.setImage(new Image(imagePaths[imageIndex]));
        verseLabel.setText(verses[verseIndex].toLowerCase()); // convert to lowercase
    }

    @FXML
    public void backToActivities(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("ActivityPage");
        scene.getStylesheets().add(HelloApplication.class.getResource("/land.css").toExternalForm());
        scene.getStylesheets().addAll(SettingsSingleton.getBackgroundColor(), SettingsSingleton.getFont());

        stage.setScene(scene);
        stage.show();
        ActivityPage activityPage = fxmlLoader.getController();
        activityPage.onBack();
    }
}
