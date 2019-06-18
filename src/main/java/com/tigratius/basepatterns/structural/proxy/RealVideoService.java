package main.java.com.tigratius.basepatterns.structural.proxy;

public class RealVideoService implements  VideoService {

    @Override
    public String getVideoInfo(int id) {
        return "Информация по видео с id = " + id;
    }
}
