# YahooApiK

This library enables the use of Yahoo's API in Kotlin/Java.
The library itself is written in Kotlin and can be used in Kotlin/Java,
and is available on GitHub Package.

## Supported APIs

* [Text analysis APIs](https://developer.yahoo.co.jp/webapi/jlp/)
  * [Correction Support](https://developer.yahoo.co.jp/webapi/jlp/kousei/v1/kousei.html)

## How To Use

First, the developer needs to create a Yahoo application
from [Yahoo Developer Center](https://e.developer.yahoo.co.jp/dashboard/). 
The credentials in the application are then used to run various APIs.

You can make a request with the following code.

```kotlin
Yahoo.withAppId(appId = ClientID)
    .correctionSupport(
        CorrectionSupportRequest(
            sentence = "遙か彼方に小形飛行機が見える"
        )
    )
```

## Author

Twitter: [@uakihir0](https://twitter.com/uakihir0)

## License

MIT
