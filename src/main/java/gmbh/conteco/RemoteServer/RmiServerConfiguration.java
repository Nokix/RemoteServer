package gmbh.conteco.RemoteServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class RmiServerConfiguration {

    @Bean
    public RmiServiceExporter registerRmiServiceExporter(
            Calculator calculator,
            @Value("${rmi.service.name}") String serviceName,
            @Value("${rmi.service.port}") int port
    ) {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName(serviceName);
        exporter.setServiceInterface(Calculator.class);
        exporter.setService(calculator);
        exporter.setRegistryPort(port);
        return exporter;
    }
}
