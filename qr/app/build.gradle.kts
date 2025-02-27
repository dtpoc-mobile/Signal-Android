plugins {
  id("signal-sample-app")
}

android {
  namespace = "org.signal.qrtest"

  defaultConfig {
    applicationId = "org.signal.qrtest.dtpoc"
  }
}

dependencies {
  implementation(project(":qr"))

  implementation(libs.google.zxing.android.integration)
  implementation(libs.google.zxing.core)
}
