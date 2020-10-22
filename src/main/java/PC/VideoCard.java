package PC;

public class VideoCard {

    private Processor processor;

    public VideoCard(Processor processor){
        this.processor=processor;
        System.out.println("Video card turning on...");
    }

    public Processor getProcessor()
    {
        return processor;
    }

    public void videoStop()
    {
        System.out.println("VideoCard shutting down...");
        processor.stopProcessor();
    }
}
