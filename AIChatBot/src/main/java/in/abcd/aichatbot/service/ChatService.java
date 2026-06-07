package in.abcd.aichatbot.service;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public final ChatClient chatClient;


    public ChatService (ChatClient.Builder geminiChatClientBuilder){
        this.chatClient = geminiChatClientBuilder.build();
    }

    public String asking(String prompt){
        return chatClient.prompt(prompt).call().content();
    }



}
