package net.kakudake.yahoo.domain

enum class CorrectionSupportNoFilter(
    val code: Int
) {
    MisConversion(1), // 誤変換 例: 人事異同 → 人事異動
    MisUse(2), // 誤用 例: 煙に巻く → けむに巻く
    NoteOnUse(3), // 使用注意 例: 外人墓地 → 外国人墓地
    NoQuickWord(4), // 不快語 例: がんをつける → にらむ
    NonUniversalCharacters(5), // 機種依存または拡張文字（EUC表示不可の場合も指摘されます）
    ForeignPlaceNames(6), // 外国地名 例:モルジブ → モルディブ
    IntrinsicNouns(7), // 固有名詞 例:ヤフーブログ → Yahoo!ブログ
    NameOfPerson(8), // 人名 例: ベートーヴェン → ベートーベン
    RaRemoved(9), // ら抜き 例: 食べれる → 食べられる
    SubstituteCharacter(10), // 当て字 例: 出鱈目、振り仮名
    NonJouyouKanji(11), // 表外漢字あり 例: 灯籠 → 灯●
    WordsForWriting(12), // 用字 例: 曖昧 → あいまい
    Paraphrase(13), // 用語言い換え（商標など）例: セロテープ → セロハンテープ
    DoubleNegative(14), // 二重否定 例: 聞かなくはない
    InsufficientAssists(15), // 助詞不足の可能性あり 例: 学校行く
    VerbosePhrase(16), // 冗長表現 例: ことができます
    Acronym(17), // 略語 例: ADSL → 非対称デジタル加入者線 (ADSL)
}