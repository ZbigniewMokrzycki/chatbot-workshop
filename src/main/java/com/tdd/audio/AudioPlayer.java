package com.tdd.audio;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;

public class AudioPlayer {

    public static final InputStream FANFARE = AudioPlayer.class.getClass().getResourceAsStream("/fanfare.wav");
    public static final InputStream CAT = AudioPlayer.class.getClass().getResourceAsStream("/cat.wav");

    public void play(InputStream soundFile) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            clip.addLineListener(event -> {
                if (event.getType().equals(LineEvent.Type.STOP)) {
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
        } catch (InterruptedException | UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }
}
