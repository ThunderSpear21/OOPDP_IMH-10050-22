abstract class Phone
{
    void call(){};
    void sms(){};
}
interface Camera
{
    void click();
    void record();
}
interface MusicPlayer
{
    void play();
    void pause();
    void stop();
}
class Smartphone extends Phone implements Camera,MusicPlayer
{
    void call()
    {
        System.out.println("Calling");
    }
    void sms()
    {
        System.out.println("Messaging");
    }
    public void click()
    {
        System.out.println("Capturing");
    }
    public void record()
    {
        System.out.println("Recording");
    }
    public void play()
    {
        System.out.println("Playing");
    }
    public void pause()
    {
        System.out.println("Pausing");
    }
    public void stop()
    {
        System.out.println("Stopping");
    }  
}
class driving
{
    public static void main(String[] args)
    {
        Phone objp = new Smartphone();
        Camera objc = new Smartphone();
        MusicPlayer objm = new Smartphone();
        objp.call();
        objp.sms();
        objc.click();
        objc.record();
        objm.play();
        objm.pause();
        objm.stop();
    }
}