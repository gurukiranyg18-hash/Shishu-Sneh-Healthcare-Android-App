package com.shishusneh.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.shishusneh.utils.NotificationHelper

class VaccineReminderWorker(

    context: Context,
    params: WorkerParameters

) : Worker(context, params) {

    override fun doWork(): Result {

        NotificationHelper.showNotification(
            applicationContext,
            "Vaccination Reminder",
            "Time for your baby's vaccination"
        )

        return Result.success()
    }
}
