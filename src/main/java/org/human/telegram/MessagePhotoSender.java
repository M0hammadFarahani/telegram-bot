package org.human.telegram;

import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;

public class MessagePhotoSender {

    public static SendPhoto createPhotoMessage(long chatId, String caption, String filePath) {
        SendPhoto msg = new SendPhoto();
        msg.setChatId(String.valueOf(chatId));
        msg.setCaption(caption);
        msg.setPhoto(new InputFile(new java.io.File(filePath)));
        return msg;
    }
}
