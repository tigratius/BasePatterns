package main.java.com.tigratius.basepatterns.structural.proxy;


public class ProxyVideoService implements VideoService {

    VideoService realService;
    private String cashedInfo;
    private int cashedId;

    public ProxyVideoService(VideoService realService) {
        this.realService = realService;
    }

    @Override
    public String getVideoInfo(int id) {

        String mes;

        if (cashedInfo == null || cashedId != id) {
            mes = "Загружаем информацию с реального источника.";
            cashedInfo = realService.getVideoInfo(id);
            cashedId = id;
        } else {
            mes = "Берем информацию из кеша.";
        }


        return mes + cashedInfo;
    }
}
