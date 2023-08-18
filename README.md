#### Environment yang diperlukan :
* NodeJs via nvm (untuk macOS/linux bisa di cek di https://github.com/nvm-sh/nvm sedangkan untuk window bisa di cek di https://github.com/coreybutler/nvm-windows )
* Appium (install via terminal/cmd setelah download node atau install Appium Desktop version )
* Intellij IDEA dengan plugin Cucumber for Java, Gherkin dan TestNG
* JDK
* Android SDK Tools
* Chromedriver sesuai dengan versi chrome di device ( https://chromedriver.chromium.org/downloads )
* Plugin POM Builder di Chrome -> untuk memudahkan saat mengambil path/id di halaman website

#### Instalasi :
1. Download dan install Intellij IDEA, JDK, Android SDK Tools,  dan NodeJS
2. Jalankan Terminal/CMD kemudian ketikkan `npm install -g appium` untuk instalasi Appium (Abaikan step ini jika install Appium Desktop version). Cek apakah sudah terinstall dengan mengetikkan `appium -v` di terminal/CMD

#### Setting environment :
##### MacOS &Linux
* Jalankan terminal/CMD
* Ketik `sudo nano ~/.bash_profile`
* Kemudian di baris pertama, ketikkan sebagai berikut (disesuaikan dengan direktori instalasi):

```
export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"
export ANDROID_HOME="/Users/<username>/Library/Android/sdk"
export PATH="${ANDROID_HOME}/tools:${PATH}"
export PATH="${ANDROID_HOME}/tools/emulator:${PATH}"
export PATH="${ANDROID_HOME}/platform-tools:${PATH}"
export PATH="${ANDROID_HOME}/platforms"
export PATH="${ANDROID_HOME}/tools/bin:${PATH}"

```
* Setelah diisi, kemudian `ctrl+x` dan pilih `Y` untuk menyimpan configurasi
* Ketikkan `source ~/.bash_profile` untuk menerapkan configurasi
* Cek apakah instalasi sudah selesai dengan mengetikkan `adb devices` di terminal dan jika tidak ada error maka sudah berhasil.

##### Windows
* Buka My Computer, kemudian klik This PC
* Di menu sebelah kiri, pilih Advanced System Settings
* Di popup, pilih tab Advanced kemudian klik Environment Variables
* Di bagian User Variables, tambahkan variabel baru dengan nama `ANDROID_HOME` dengan value tempat install Android SDK, misal `C:\Android\Android-sdk`
* Tambahkan juga variabel `JAVA_HOME` dengan value tempat install jdk, misal `C:\Program Files\Java\jdk1.8.0\`
* Klik variabel Path, kemudian tambahkan value berikut:
  ```
  %ANDROID_HOME%\tools
  %ANDROID_HOME%\build-tools
  %ANDROID_HOME%\platform-tools
  %JAVA_HOME%\bin
  ```
* Simpan semua pengaturan kemudian restart laptop, setelah itu ketikkan `adb devices` di terminal. Jika tidak ada error maka sudah berhasil
* 
#### Running project on local:
* Sambungkan device ke laptop, kemudian ketik `adb devices` dan lihat apakah device-id sudah tampil, jika list devices id masih kosongan maka :
    * cek apakah device sudah dalam developer mode dengan cara : buka Setting > System > Apakah sudah ada opsi Developer options? Kalau belum, aktifkan dengan cara buka Setting > About phone > di bagian build number, tap 7x.
    * pastikan sudah mengaktifkan usb debugging di Developer Options dan allow connection from laptop
    * pastikan kabel yang digunakan adalah kabel usb debug
* Buka project dengan Intellij IDE
* Copy seluruh isi file BaseTest.java.example kemudian paste ke dalam file BaseTest.java
* Ubah value chromedriverExecutable ke folder tempat ekstrak chromedriver sampai nama file tanpa .exe
* Jika ingin mengetes aplikasi Traveloka maka di file `src/test/resources/configuration.properties` di bagian `android.appPackage=com.innovecto.etalastic` diganti dengan `android.appPackage=com.innovecto.etalastic.staging`
* Di file testng.xml ubah deviceName sesuai dengan device id dari langkah sebelumnya dan platformVersion sesuai dengan versi android di device
* Pastikan sudah menginstall aplikasi Traveloka (baik dev ataupun prod) version di device
* Di file testng.xml klik kanan kemudian pilih Run
* Atau, di terminal/CMD ketik command `mvn clean install test -DsuiteXmlFile=<file_xml>`