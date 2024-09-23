package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView avatarImageView;
    private TextView nameTextView;
    private TextView infoTextView;
    private Button editProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Инициализация компонентов
        avatarImageView = findViewById(R.id.avatarImageView);
        nameTextView = findViewById(R.id.nameTextView);
        infoTextView = findViewById(R.id.infoTextView);
        editProfileButton = findViewById(R.id.editProfileButton);

        // Установка данных (можно заменить данными из базы данных или переданных через Intent)
        nameTextView.setText("Иван Иванов");
        infoTextView.setText("Программирование. Люблю читать книги и путешествовать.");
        avatarImageView.setImageResource(R.drawable.avatar_placeholder); // Замените на реальное изображение

        // Обработка нажатия на кнопку
        editProfileButton.setOnClickListener(v -> {
            // Логика для редактирования профиля
        });
    }
}