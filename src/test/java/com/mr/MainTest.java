package com.mr;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class MainTest {

    @Mock
    CloseableHttpClient httpClient;

    @Mock
    CloseableHttpResponse response;

    @Test
    public void testMain() throws Exception {
        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Mock the HTTP client to return a response
        when(httpClient.execute(any())).thenReturn(response);

        // Create an instance of the Main class
        Main main = new Main(httpClient);

        // Call the main method
        main.main();

        // Verify that the HTTP client's execute method was called
        verify(httpClient, times(1)).execute(any());

        // Verify the output content, you can add more assertions based on your needs
        String expectedOutput = "org.apache.http.impl.client.CloseableHttpResponse@";
        String actualOutput = outContent.toString().trim();
        assert(actualOutput.contains(expectedOutput));
    }
}
