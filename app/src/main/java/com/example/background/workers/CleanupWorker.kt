package com.example.background.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class CleanupWorker(ctx: Context, params: WorkerParameters):Worker(ctx, params) {
}