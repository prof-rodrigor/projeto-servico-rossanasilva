package br.ufpb.dcx.rodrigor.servico.ping.controllers;

import br.ufpb.dcx.rodrigor.servico.Keys;
import br.ufpb.dcx.rodrigor.servico.login.LoginController;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.http.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class PingController {

    private static final Logger logger = LogManager.getLogger(PingController.class);

    // /v1/ping
    public void ping(Context ctx) {
        String serviceName = ctx.appData(Keys.SERVICO_NOME.key());
        ctx.json(Map.of("servico.nome", serviceName));
    }
}
