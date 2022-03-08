package com.example.ambu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Completable
import java.util.concurrent.TimeUnit

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Completable.timer(3,TimeUnit.SECONDS, AndroidSchedulers.mainThread())
            .subscribe {
                Toast.makeText(this@SplashScreenActivity, "SplashScreen done !", Toast.LENGTH_SHORT)
                    .show()
            }
    }
}