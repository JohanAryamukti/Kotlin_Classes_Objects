fun main() {
    println("=== SIMULASI SISTEM NOTIFIKASI APLIKASI MOBILE ===\n")

    // 1. Notifikasi Email
    val emailService: NotificationAction = EmailNotification("mahasiswa.informatika@usd.ac.id")
    emailService.sendNotification("Kode OTP verifikasi aplikasi mobile Anda adalah: 4829")

    // 2. Push Notification
    val pushService: NotificationAction = PushNotification("fcm_token_xyz123_android_phone")
    pushService.sendNotification("Diskon 50% khusus pengguna baru hari ini! Klik di sini.")

    // 3. SMS Notification (Tambahan Soal 3)
    val smsService: NotificationAction = SMSNotification("+6282179964995")
    smsService.sendNotification("Pulsa Anda hampir habis!")
}