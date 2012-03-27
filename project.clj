(defproject clojure-game-of-life-dojo "1.0.0-SNAPSHOT"
  :description "A simple example of how to use lein-cljsbuild"
  :source-path "src-clj"
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :dev-dependencies [[lein-ring "0.5.4"]]
  :plugins [[lein-cljsbuild "0.1.3"]]
  :cljsbuild {
    :builds [{:source-path "src-cljs"
              :compiler {:output-to "resources/public/js/main.js"
                         :optimizations :whitespace
                         :pretty-print true}}]} )

