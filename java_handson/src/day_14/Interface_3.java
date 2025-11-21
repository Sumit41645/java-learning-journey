package day_14;

public class Interface_3
{
    public static void main(String [] args)
    {
        MusicPlayer m=new PhoneMusicPlayer();
        m.play();
        m.stop();
        MusicPlayer.showVolume();
    }
}
interface MusicPlayer
{
    void play();
    default void stop()
    {
        System.out.println("Music Stopped");
    }
    static void showVolume()
    {
        System.out.println("Volume: 100%");
    }
}
class PhoneMusicPlayer implements MusicPlayer
{
    public void play()
    {
        System.out.println("Playing music........");
    }
}

