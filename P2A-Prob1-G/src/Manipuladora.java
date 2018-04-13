
import problema1.AIFFSuperPlayer;
import problema1.WAVPlayer;
import problema1.wmaPlay;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joaovitoraguiar
 */
public class Manipuladora implements FormatoAudio{

    public static void main(String[] args) {
        
    }

    String extencao;
    
    WAVPlayer wav;
    wmaPlay wma;
    AIFFSuperPlayer aiff;
    
    @Override
    public void abrir(String file) {
        extencao = file.split(".")[file.split(".").length -1];

        switch (extencao) {
            case "WAV":
                wav = new WAVPlayer(file);
                break;

            case "WMA":
                wma = new wmaPlay();
                wma.setFile(file);
                break;

            case "AIFF":
                aiff = new AIFFSuperPlayer(file);
                break;
                
        }

    }

    @Override
    public void reproduzir() {

        switch (extencao) {
            case "WAV":
                wav.play();
                break;

            case "WMA":
                wma.play();
                break;

            case "AIFF":
                aiff.play();
                break;
                
        }
    }

    @Override
    public void pausar() {
        switch (extencao) {
            case "WAV":
                wav.stop();
                break;

            case "WMA":
                wma.stop();
                break;

            case "AIFF":
                aiff.pause();
                break;
                
        }
    }

    @Override
    public void parar() {
        switch (extencao) {
            case "WAV":
                wav.stop();
                wav.reward(wav.reward(0));
                break;

            case "WMA":
                wma.stop();
                wma.setLocation(0);
                break;

            case "AIFF":
                aiff.stop();
                aiff.setCursor(0);
                break;
                
        }
    }

    @Override
    public void avancar(int value) {
        switch (extencao) {
            case "WAV":
                wav.forward(value);
                break;

            case "WMA":
                wma.setLocation(wma.getLocation() + value);
                break;

            case "AIFF":
                aiff.setCursor(aiff.pause() + value);
                aiff.play();
                break;
                
        }
    }

    @Override
    public void retornar(int value) {
        switch (extencao) {
            case "WAV":
                wav.reward(value);
                break;

            case "WMA":
                wma.setLocation(wma.getLocation() - value);
                break;

            case "AIFF":
                aiff.setCursor(aiff.pause() - value);
                aiff.play();
                break;
                
        }
    }

    @Override
    public void liberar() {
        switch (extencao) {
            case "WAV":
                wav = null;
                break;

            case "WMA":
                wma = null;
                break;

            case "AIFF":
                aiff.release();
                break;
                
        }
    }

    @Override
    public void reproduzirSimples(String file) {
        switch (extencao) {
            case "WAV":
                wav = new WAVPlayer(file);
                wav.play();
                break;

            case "WMA":
                wma = new wmaPlay();
                wma.setFile(file);
                wma.play();
                break;

            case "AIFF":
                aiff = new AIFFSuperPlayer(file);
                aiff.play();
                break;
                
        }
    }

    @Override
    public void pararSimples() {
        switch (extencao) {
            case "WAV":
                wav.stop();
                wav.reward(wav.reward(0));
                wav = null;
                break;

            case "WMA":
                 wma.stop();
                wma.setLocation(0);
                wma = null;
                break;

            case "AIFF":
                aiff.stop();
                aiff.setCursor(0);
                aiff.release();
                break;
                
        }
    }
}
