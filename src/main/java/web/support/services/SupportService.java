package web.support.services;

import web.support.models.SupportInfo;
import web.support.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SupportService {
    @Autowired
    private SupportRepository supportRepository;

    public List<SupportInfo> getSupport() {
        return supportRepository.findAll();
    }
}
