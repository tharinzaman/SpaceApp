package com.example.spaceapp.data

data class Planet(
    val name: String,
    val noFromSun: Int,
    val distFromSun: String,
    val timeToGetThere: String?,
    val orbitalPeriod: String,
    val dayLength: String,
    val averageTemp: String,
    val yearDiscovered: Int?,
    val discoveredBy: String?,
    val mainImage: String,
    val images: List<String> = emptyList(),
    val videos: List<String> = emptyList(),
    val state: State,
    val description: String
)

fun getPlanets(): List<Planet> {
    return listOf(
        Planet(
            "Mercury",
            1,
            "60.442 million km",
            "40 days",
            "88 days",
            dayLength = "59 days",
            "167ºC",
            yearDiscovered = 1631,
            discoveredBy = "Thomas Harriot and Galileo Galilei",
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/4/4a/Mercury_in_true_color.jpg",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/2266_PIA19216_1280.jpg",
                "https://solarsystem.nasa.gov/system/resources/list_images/1053_merc_320.png",
                "https://solarsystem.nasa.gov/system/resources/detail_files/773_PIA16388_detail.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/770_PIA15202.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/742_degas_EW0258052721.png",
                "https://solarsystem.nasa.gov/system/resources/detail_files/525_PIA19242.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/528_PIA18739.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/522_PIA19423.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/523_PIA19282.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/440_UnmaskingMercury1000w.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/441_HollowsMercury.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/522_PIA19423.jpg"
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/178_MESSENGER_falsecolor_Mercury_globe_spin_big.webmhd.webm",
                "https://solarsystem.nasa.gov/system/video_items/174_LunarEclipse_20141008_x2.mp4",
            ),

            state = State.Terrestrial,
            description = "Mercury was discovered in 1631 by Thomas Harriot and Galileo Galilei. " +
                    "It has a distance from the Sun of 40.422 million kilometers, making it the " +
                    "closest planet to the Sun. It's orbital period around the Sun is 88 days, thus" +
                    " a year on Mercury is equivalent to only 88 Earth days. Furthermore, it takes" +
                    " Mercury 59 Earth days to rotate on it's axis, making a day on Mercury equivalent" +
                    " to 88 days on Earth. Since its orbital period is 88 days and its sidereal day is " +
                    "59 days, a year on Mercury about a day and a half. It would take 40 days to travel" +
                    " from Earth to Mercury. Mercury is a terrestrial planet and has an average temperature of 167ºC."
        ),
        Planet(
            "Venus",
            2,
            "108.64 million km",
            "109 days",
            "255 days",
            "243",
            "464ºC",
            1610,
            discoveredBy = "Galileo Galilei",
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/0/08/Venus_from_Mariner_10.jpg",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/477_CraterFarm1200w.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/478_i_VenusMagellan.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/480_VenusMaatMons1200w.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/486_PIA00159.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/485_LaviniaRegion1200w.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/533_PIA00072.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/543_PIA10125.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/544_opo9516g.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/546_PIA00480.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/547_PIA00479.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/688_Venus.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/774_PIA00107_detail.jpg"
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/180_PIA10125.mp4.mp4",
                "https://solarsystem.nasa.gov/system/video_items/74_venus_h264_cut_II.m4v"
            ),
            state = State.Terrestrial,
            description = "Venus was discovered in 1610 by Galileo Galilei. " +
                    "It has a distance from the Sun of 108.64 million kilometers, making it the " +
                    "second closest planet to the Sun. It's orbital period around the Sun is 255 days, thus" +
                    " a year on Venus is equivalent to 255 Earth days. Furthermore, it takes" +
                    " Venus 243 Earth days to rotate on it's axis, making a day on Venus equivalent" +
                    " to 243 days on Earth, almost an entire Earth year!. Since its orbital period is 255 days," +
                    " and its sidereal day is " +
                    "243 days, a year on Venus is almost a Venus day. It would take 109 days to travel" +
                    " from Earth to Venus. Venus is a terrestrial planet and has an average temperature of 464ºC," +
                    " making it the hottest planet in the solar system. Despite it being further away from the Sun" +
                    " than Mercury, Venus is hotter due to its greenhouse gas filled atmosphere."
        ),
        Planet(
            "Earth",
            3,
            "152 million km",
            null,
            "365 days",
            dayLength = "24 hours",
            "13.9ºC",
            null,
            null,
            state = State.Terrestrial,
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/c/cb/The_Blue_Marble_%28remastered%29.jpg",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/2337_as11-44-6549_med.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2333_PIA14447_med.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2332_earth_dscovr_apr19_med.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2292_as08-14-2383.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2257_meteorcrater_aer_2007158_1280.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/851_JSC2016E096363_detail.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/838_58_GPN-2000-001090_detail.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/831_2seaicemoves-alt_detail.gif",
                "https://solarsystem.nasa.gov/system/resources/detail_files/833_image01142013_250m.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/1040_klyuchevskaya_oli_enlarge.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2255_morg_and_alex_1280.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2628_Partial_Solar_Eclipse-800x600.jpg",
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/202_earthday_2018_c.mp4",
                "https://solarsystem.nasa.gov/system/video_items/190_near_earth_sciences02_1080p60.mp4",
                "https://solarsystem.nasa.gov/system/video_items/165_slow_spin.m4v",
                "https://solarsystem.nasa.gov/system/video_items/637_0501_hydropthermal_vents_640x360.mp4"
            ),
            description = "Earth is our home planet. It has a distance from the Sun of 152 million kilometers, making it the " +
                    "3rd closest planet to the Sun and placing it in the Goldilocks zone, a habitable " +
                    "distance from the planet's orbital star where life can survive. It's orbital period" +
                    " around the Sun is 365 days, thus a year on Earth is equivalent to only 365 days. Furthermore, it takes" +
                    " Earth 24 hours to rotate on it's axis, making a day on Earth equivalent" +
                    " 24 hours. Earth is a terrestrial planet and has an average temperature of 13.9ºC."
        ),
        Planet(
            "Mars",
            4,
            "207.88 million km",
            "300 days",
            "687 days",
            dayLength = "25 hours",
            "-60ºC",
            1610,
            discoveredBy = "Galileo Galilei",
            state = State.Terrestrial,
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/2669_Curiosity_Postcard_pia24937-800x600.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2510_marspolarcrater_1600.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2445_ESP_057930_med.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2442_PIA23205_med.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2430_PIA00576.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2429_PIA00567.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2407_PIA23177.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2325_PIA10705_1280.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2428_Victoria_clouds_br.gif",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2427_06-OSS-01-Clouds-ani_med.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2431_PIA07997_1280.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2489_ESP_060176_2640_1200.jpg"
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/630_STScI-H-v1729a-1920x1080.mp4",
                "https://solarsystem.nasa.gov/system/video_items/613_TWITTER_720-20252_Phobos_Electric_Charging_APR_twitter_720.mp4",
                "https://solarsystem.nasa.gov/system/video_items/225_Wet_Mars.mp4",
                "https://solarsystem.nasa.gov/system/video_items/98_-home-www-videos-mer-mer20100126-spirit20100126-1280.m4v"
            ),
            description = "Mars was discovered in 1610 by Galileo Galilei. It has a distance from the Sun " +
                    "of 207.88 million kilometers, making it the 4th closest planet to the Sun. It's orbital period around the Sun is 687 days, thus" +
                    " a year on Mars is equivalent to around 2 Earth years. Furthermore, it takes" +
                    " Mars 25 Earth hours to rotate on it's axis, making a day on Mars almost equal to a day on Earth. " +
                    "It would take 300 days to travel" +
                    " from Earth to Mars. Mars is a terrestrial planet and has an average temperature of -60ºC."
        ),
        Planet(
            "Jupiter",
            5,
            "742.89 million km",
            "5 years",
            "12 years",
            dayLength = "10 hours",
            "-145ºC",
            1610,
            discoveredBy = "Galileo Galilei",
            state = State.Gas,
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/2662_Galilean_Moons-800.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2486_stsci-h-p1936a_1800.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2479_grs_animation_1200.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2467_P44431Ac_1280.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2441_PIA21033.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2263_PIA21644.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/812_PIA00080.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/809_PIA00583.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2466_P44542.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2658_Ganymede_Infrared_PIA24791-800x600.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2660_Jupiter_Moons_PIA09352-800x600.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/2664_Pioneer_10_Ganymede_2679_AC73-9279-800x600.jpg"
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/665_shoemaker-levy9_train.mp4",
                "https://solarsystem.nasa.gov/system/video_items/658_PIA23229.mp4",
                "https://solarsystem.nasa.gov/system/video_items/295_Jupiter_Polar_Winds.mp4.mp4",
                "https://solarsystem.nasa.gov/system/video_items/291_uvis010124.mp4.mp4",
                "https://solarsystem.nasa.gov/system/video_items/605_Jupiter_JupiterBasic_Dayside.HD1080i_p30.mp4"

            ),
            description = "Jupiter was discovered in 1610 by Galileo Galilei. It has a distance from the Sun " +
                    "of 742.89 million kilometers, making it the 5th closest planet to the Sun. It's orbital period around the Sun is" +
                    "equivalent to 12 Earth years, thus" +
                    " a year on Jupiter is equivalent to around 12 Earth years. Furthermore, it takes" +
                    " Jupiter 10 Earth hours to rotate on it's axis, making a day on Jupiter almost equal to a half a day on Earth. " +
                    "It would take 5 years to travel" +
                    " from Earth to Jupiter. Jupiter is a gas giant and has an average temperature of -145ºC."
        ),
        Planet(
            "Saturn",
            6,
            "1.47 billion km",
            "8 years",
            "29 years",
            dayLength = "11 hours",
            "-140ºC",
            1610,
            discoveredBy = "Galileo Galilei",
            state = State.Gas,
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/c/c7/Saturn_during_Equinox.jpg",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/2490_stsci-h-p1943a-f_1200.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/17848_PIA12797-full.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/870_PIA08119.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/869_PIA07232_%281%29.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/868_PIA14910.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/17830_PIA18323-full.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/864_PIA18335.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/862_PIA14924.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/17822_PIA21903_FigA_unlabeled_MAIN.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/722_739460main_ac79-9107.3.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/689_5678_IMG004678.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/689_5678_IMG004678.jpg"
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/611_Saturn_SaturnBasic_Dayside.HD1080i_p30.mp4",
                "https://solarsystem.nasa.gov/system/video_items/564_PIA21620_moviewithaudio.m4v",
                "https://solarsystem.nasa.gov/system/video_items/538_JPL-20170413-CASSINf-0001-1080cc.m4v",
                "https://solarsystem.nasa.gov/system/video_items/679_Cassini_EntireTrajectory_Rotating_compressed.mp4"
            ),
            description = "Saturn was discovered in 1610 by Galileo Galilei. It has a distance from the Sun " +
                    "of 1.47 billion kilometers, making it the 6th closest planet to the Sun. It's orbital period around the Sun is" +
                    "equivalent to 29 Earth years, thus" +
                    " a year on Saturn is equivalent to around 29 Earth years. Furthermore, it takes" +
                    " Saturn 11 Earth hours to rotate on it's axis, making a day on Saturn almost equal to a half a day on Earth. " +
                    "It would take 8 years to travel" +
                    " from Earth to Saturn. Saturn is also a gas giant and has an average temperature of -140ºC."
        ),
        Planet(
            "Uranus",
            7,
            "2.94 billion km",
            "10 years",
            "84 years",
            dayLength = "17 hours",
            "-195ºC",
            1781,
            discoveredBy = "William Herschel",
            state = State.Ice,
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/4/48/Uranus_as_seen_by_NASA%27s_Voyager_2_%28remastered%29.png",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/797_PIA01391.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/605_PIA17306.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/601_PIA00033.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/455_UranusinDetail.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/453_Uranus-rings.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/452_PIA01279.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/449_PIA01535.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/448_PIA01278_modest.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/451_PIA01280.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/445_PIA02963.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/450_PIA01360.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/604_PIA00346.jpg"
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/66_-home-www-videos-voyager-20130912d-discovery20110428-640.m4v"
            ),
            description = "Uranus was discovered in 1781 by William Herschel. It has a distance from the Sun " +
                    "of 2.94 billion kilometers, making it the 7th closest planet to the Sun. It's orbital period around the Sun is" +
                    "equivalent to 84 Earth years, thus" +
                    " a year on Uranus is equivalent to around 84 Earth years. Furthermore, it takes" +
                    " Uranus 17 Earth hours to rotate on it's axis, making a day on Uranus just a 7 hours shorter than that on Earth. " +
                    "It would take 10 years to travel" +
                    " from Earth to Uranus. Uranus is an ice giant and has an average temperature of -195ºC. An additional fun fact is that Uranus rotates sidewards on it's axis."
        ),
        Planet(
            "Neptune",
            8,
            "4.47 billion km",
            "12 years",
            "165 years",
            dayLength = "16 hours",
            "-200ºC",
            1846,
            discoveredBy = "Urbain Le Verrier, John Couch Adams and Johann Gottfried Galle",
            state = State.Ice,
            mainImage = "https://upload.wikimedia.org/wikipedia/commons/6/63/Neptune_-_Voyager_2_%2829347980845%29_flatten_crop.jpg",
            images = listOf(
                "https://solarsystem.nasa.gov/system/resources/detail_files/936_eso1824a.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/842_31101484000_02c1a70913_o.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/614_PIA01997.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/616_PIA02215.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/609_PIA01285.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/607_PIA00058.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/252_PIA02256.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/238_mapoftriton1200w.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/237_PIA12186.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/230_PIA02214.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/233_TritonMosaic233_1200w.jpg",
                "https://solarsystem.nasa.gov/system/resources/detail_files/238_mapoftriton1200w.jpg"
            ),
            videos = listOf(
                "https://solarsystem.nasa.gov/system/video_items/112_PIA18669-1280.m4v",
                "https://solarsystem.nasa.gov/system/video_items/110_PIA12187.m4v"
            ),
            description = "Neptune was discovered in 1846 by Urbain Le Verrier, John Couch Adams and Johann Gottfried Galle" +
                    ". It has a distance from the Sun " +
                    "of 4.47 billion kilometers, making it the 8th closest planet to the Sun, thus, the furthest. It's orbital period around the Sun is" +
                    "equivalent to 165 Earth years, thus" +
                    " a year on Neptune is equivalent to around 165 Earth years. Furthermore, it takes" +
                    " Neptune 16 Earth hours to rotate on it's axis, making a day on Neptune equal to two thirds of a day on Earth. " +
                    "It would take 12 years to travel" +
                    " from Earth to Neptune. Neptune is also an ice giant and has an average temperature of -200ºC."
        )
    )
}
