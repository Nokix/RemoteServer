package gmbh.conteco.RemoteServer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class HTTPExporter {
    @Bean("/calculator")
    public HttpInvokerServiceExporter calculatorService(
            Calculator calculator
    ) {
        HttpInvokerServiceExporter exporter =
                new HttpInvokerServiceExporter();

        exporter.setService(calculator);
        exporter.setServiceInterface(Calculator.class);
        return exporter;
    }
}
