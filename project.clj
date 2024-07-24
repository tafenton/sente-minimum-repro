(defproject data-importer "0.1.0-SNAPSHOT"
  :dependencies [[aleph "0.7.0"]
                 [com.taoensso/sente "1.18.0"]
                 [org.clojure/clojure "1.11.3"]]
  :main ^:skip-aot data-importer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})