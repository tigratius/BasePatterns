package main.java.com.tigratius.basepatterns.structural.proxy;

public class ServiceRunner {
    public static void main(String[] args) {

        VideoService videoService = new ProxyVideoService(new RealVideoService());
        System.out.println(videoService.getVideoInfo(1));
        System.out.println(videoService.getVideoInfo(1));
        System.out.println(videoService.getVideoInfo(2));
        System.out.println(videoService.getVideoInfo(2));
        System.out.println(videoService.getVideoInfo(3));
    }
}
