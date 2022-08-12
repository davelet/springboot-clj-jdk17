(ns org.brinman2002.app.BrandonApplication
    (:import 
        (org.springframework.boot.autoconfigure SpringBootApplication)
        (org.springframework.boot SpringApplication)
    ))

(gen-class
  :name ^{SpringBootApplication []} org.brinman2002.app.BrandonApplication
  :main true
)

(defn -main
  [  ]
    (SpringApplication/run (Class/forName "org.brinman2002.app.BrandonApplication") (into-array String '()))
)
