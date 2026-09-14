// A. Interface kontrak notifikasi
interface NotificationAction {
    fun sendNotification(msg: String)
}

//B. Concrete Class: Email
class EmailNotification(private val emailAddress: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("[EMAIL NOTIFICATION]")
        println("Tujuan: $emailAddress")
        println("Pesan : $msg\n")
    }
}

//C. Concrete Class: Push Notification
class PushNotification(private val deviceToken: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("[PUSH NOTIFICATION]")
        println("Token : $deviceToken")
        println("Pesan : $msg\n")
    }
}

//D. Concrete Class Baru: SMS Notification (Soal 3)
class SMSNotification(private val phoneNumber: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("[SMS NOTIFICATION]")
        println("Nomor : $phoneNumber")
        println("Pesan : $msg\n")
    }
}