package se_3355;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se_3355.entity.Finance;
import se_3355.entity.News;
import se_3355.entity.Weather;
import se_3355.repository.FinanceRepository;
import se_3355.repository.NewsRepository;
import se_3355.repository.WeatherRepository;

@Component
public class DataLoader {

    @Autowired
    private NewsRepository newsRepo;

    @Autowired
    private FinanceRepository financeRepo;

    @Autowired
    private WeatherRepository weatherRepo;

    @PostConstruct
    public void loadData() {
        newsRepo.save(new News(1L, "Deprem Oldu", "AFAD açıklama yaptı, artçılar bekleniyor.", "https://media.cumhuriyet.com.tr/Archive/5bf46fef-6867-448a-9628-08d7397c5e75.jpg"));
        newsRepo.save(new News(2L, "Dolar Rekor Kırdı", "Ekonomik dalgalanma devam ediyor.", "https://www.urfadegisim.com/images/haberler/2018/08/dolar-yine-rekor-kirdi.jpg"));
        newsRepo.save(new News(3L, "Sınav Sonuçları Açıklandı", "ÖSYM duyurdu, sonuçlar sistemde.", "https://cdnuploads.aa.com.tr/uploads/Contents/2022/07/18/thumbs_b_c_479a718ee7cce35bcb43183fdb9eb52e.jpg"));
        newsRepo.save(new News(4L, "Yapay Zeka Gelişiyor", "Yeni modeller, eski sınırları aşıyor.", "https://www.bthaber.com/wp-content/uploads/2024/02/11.jpg"));
        newsRepo.save(new News(5L, "Fırtına Uyarısı", "Meteoroloji bazı bölgeler için uyarıda bulundu.", "https://trthaberstatic.cdn.wp.trt.com.tr/resimler/2360000/2360907.jpg"));
        newsRepo.save(new News(6L, "LGS Yaklaşıyor", "Öğrenciler son hazırlıklarını yapıyor.", "https://i.ytimg.com/vi/kvxuGbp25wU/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLCj61hRXgzN6sFyKB-bSbHAdL30Ww"));
        newsRepo.save(new News(7L, "Milli Takım Galip", "Türkiye, rakibini 2-1 mağlup etti.", "https://www.akifhaber.com/wp-content/uploads/2024/06/GQX-KPOXIAAsoND.jpeg"));
        newsRepo.save(new News(8L, "Yeni Telefon Tanıtıldı", "Marka X'in yeni modeli ilgi çekti.", "https://img.chip.com.tr/rcman/Cw940h529q95gm/storage/files/images/2025/03/21/huaweinin-yeni-kapakli-telefonu-alisilmadik-sekilde-genis-mro1.jpg"));
        newsRepo.save(new News(9L, "Benzine Zam", "Akaryakıt fiyatlarına gece yarısı zam geliyor.", "https://eyupsultan.com.tr/images/haberler/2025/05/benzine-zam-geldi-sirada-motorin-var-iste-guncel-fiyatlar-ve-yeni-zam-tarihi-3538.png"));
        newsRepo.save(new News(10L, "YKS Kılavuzu Yayınlandı", "Sınav detayları ve başvuru tarihleri belli oldu.", "https://turgutluram.meb.k12.tr/meb_iys_dosyalar/45/15/773688/resimler/2025_02/k_07120106_yksbasvuruduyuru.jpg"));

        financeRepo.save(new Finance(1L, "DOLAR", 32.4));
        financeRepo.save(new Finance(2L, "ALTIN", 2450.75));
        financeRepo.save(new Finance(3L, "BORSA", 9200.0));
        financeRepo.save(new Finance(4L, "STERLIN", 51.66));
        financeRepo.save(new Finance(5L, "BITCOIN", 103460.0));
        financeRepo.save(new Finance(6L, "FAIZ", 48.99));

        weatherRepo.save(new Weather(1L, "2025-05-15", "Güneşli", 28.3));
        weatherRepo.save(new Weather(2L, "2025-05-16", "Yağmurlu", 21.4));
        weatherRepo.save(new Weather(3L, "2025-05-17", "Bulutlu", 23.0));
        weatherRepo.save(new Weather(4L, "2025-05-18", "Açık", 26.8));
        weatherRepo.save(new Weather(5L, "2025-05-19", "Fırtına", 19.7));
    }
}
