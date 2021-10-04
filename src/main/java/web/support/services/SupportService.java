package web.support.services;

import web.support.models.SupportInfo;
import web.support.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SupportService {
    @Autowired
    private SupportRepository supportRepository;

    public SupportInfo getSupportInfo() {
        return supportRepository.getSupportInfo();
    }
}
