package OOP;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class MusicPlayer{
    public static void main(String[] args){
        String filePath = "src/The Script - Hall of Fame (Official Video) ft. will.i.am [mk48xRzuNvA].wav";
        File file = new File(filePath);



        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();) {


           clip.open(audioStream);
//            System.out.println("No problems detected");

//            clip.start();
            String response=" ";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Rest");
                System.out.println("Q = Quit");
                System.out.print("Enter your Choice: ");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }


        }
        catch(FileNotFoundException e){
            System.out.println("Audio file not found");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to import audio");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Goodbye!!");
        }
    }
}