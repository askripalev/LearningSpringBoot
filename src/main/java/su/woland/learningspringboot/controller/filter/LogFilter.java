package su.woland.learningspringboot.controller.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.text.WordUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;

@Component
@Log4j2
public class LogFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull FilterChain filterChain)
            throws ServletException, IOException {
        ContentCachingRequestWrapper cachedRequest = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper cachedResponse = new ContentCachingResponseWrapper(response);

        filterChain.doFilter(cachedRequest, cachedResponse);

        log.info(logRequest(cachedRequest));
        log.info(logResponse(cachedResponse));
    }

    private @NotNull String logRequest(@NotNull ContentCachingRequestWrapper cachedRequest) throws JsonProcessingException {
        StringBuilder requestLog = new StringBuilder();
        byte[] requestBody = cachedRequest.getContentAsByteArray();
        Enumeration<String> requestHeaders = cachedRequest.getHeaderNames();

        while (requestHeaders.hasMoreElements()) {
            String header = requestHeaders.nextElement();
            requestLog.append(WordUtils.capitalize(header)).append(": ").append(cachedRequest.getHeader(header)).append("\n");
        }

        requestLog.append("Body: ").append(jsonPrettyPrint(new String(requestBody, StandardCharsets.UTF_8)));

        return "Request:\n" + requestLog;
    }

    private @NotNull String logResponse(@NotNull ContentCachingResponseWrapper cachedResponse) throws IOException {
        StringBuilder responseLog = new StringBuilder();
        byte[] responseBody = cachedResponse.getContentAsByteArray();

        cachedResponse.copyBodyToResponse();
        cachedResponse.getHeaderNames().forEach(item -> responseLog.append(item).append(": ").append(cachedResponse.getHeader(item)).append("\n"));
        responseLog.append("Body: ").append(jsonPrettyPrint(new String(responseBody, StandardCharsets.UTF_8)));

        return "Response:\n" + responseLog;
    }

    private String jsonPrettyPrint(String sourceJsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(sourceJsonString, Object.class);

        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
    }

}
