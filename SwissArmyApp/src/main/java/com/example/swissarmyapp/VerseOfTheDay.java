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
            "/VerseImages/VerseImage1.jpeg",
            "/VerseImages/VerseImage2.jpeg",
            "/VerseImages/VerseImage3.jpeg",
            "/VerseImages/VerseImage4.jpeg",
            "/VerseImages/VerseImage5.jpeg",
            "/VerseImages/VerseImage6.jpeg",
            "/VerseImages/VerseImage7.jpeg",
            "/VerseImages/VerseImage8.jpeg",
            "/VerseImages/VerseImage9.jpeg",
            "/VerseImages/VerseImage10.jpeg",
            "/VerseImages/VerseImage11.jpeg",
            "/VerseImages/VerseImage12.jpeg",
            "/VerseImages/VerseImage13.jpeg",
            "/VerseImages/VerseImage14.jpeg",
            "/VerseImages/VerseImage15.jpeg",
            "/VerseImages/VerseImage16.jpeg",
            "/VerseImages/VerseImage17.jpeg",
            "/VerseImages/VerseImage18.jpeg",
            "/VerseImages/VerseImage19.jpeg",
            "/VerseImages/VerseImage20.jpeg",
            "/VerseImages/VerseImage21.jpeg",
            "/VerseImages/VerseImage22.jpeg",
            "/VerseImages/VerseImage23.jpeg",
            "/VerseImages/VerseImage24.jpeg",
            "/VerseImages/VerseImage25.jpeg",
            "/VerseImages/VerseImage26.jpeg",
            "/VerseImages/VerseImage27.jpeg",
            "/VerseImages/VerseImage28.jpeg",
            "/VerseImages/VerseImage29.jpeg",
            "/VerseImages/VerseImage30.jpeg",

    };

    private String[] verses = {
            "For God so loved the world, that he gave his only Son, that whoever believes in him should not perish but have eternal life. - John 3:16 ESV",
            "Trust in the Lord with all your heart, and do not lean on your own understanding. - Proverbs 3:5 ESV",
            "I can do all things through him who strengthens me. - Philippians 4:13 ESV",
            "The Lord is my shepherd; I shall not want. - Psalm 23:1 ESV",
            "And we know that for those who love God all things work together for good, for those who are called according to his purpose. - Romans 8:28 ESV",
            "For we walk by faith, not by sight. - 2 Corinthians 5:7 ESV",
            "Do not be anxious about anything, but in everything by prayer and supplication with thanksgiving let your requests be made known to God. - Philippians 4:6 ESV",
            "And let us not grow weary of doing good, for in due season we will reap, if we do not give up. - Galatians 6:9 ESV",
            "For by grace you have been saved through faith. And this is not your own doing; it is the gift of God. - Ephesians 2:8 ESV",
            "I have been crucified with Christ. It is no longer I who live, but Christ who lives in me. And the life I now live in the flesh I live by faith in the Son of God, who loved me and gave himself for me. - Galatians 2:20 ESV",
            "Therefore, since we are surrounded by so great a cloud of witnesses, let us also lay aside every weight, and sin which clings so closely, and let us run with endurance the race that is set before us. - Hebrews 12:1 ESV",
            "If we confess our sins, he is faithful and just to forgive us our sins and to cleanse us from all unrighteousness. - 1 John 1:9 ESV",
            "And whatever you do, in word or deed, do everything in the name of the Lord Jesus, giving thanks to God the Father through him. - Colossians 3:17 ESV",
            "Blessed are the peacemakers, for they shall be called sons of God. - Matthew 5:9 ESV",
            "Rejoice in the Lord always; again I will say, rejoice. - Philippians 4:4 ESV",
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
        verseLabel.setText(verses[verseIndex]);
    }

    @FXML //to go back to Activity Page
    public void backToActivities(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("ActivityPage");
        stage.setScene(scene);
        stage.show();
    }
}
