(set-env! :resource-paths #{"src", "test"}
          :dependencies `[[org.clojure/clojure ~(clojure-version)]
                          [ags799/bootlaces "7e1a42c"]
                          [clj-http/clj-http "3.7.0"]
                          [metosin/compojure-api "2.0.0-alpha7"]
                          [ring/ring-jetty-adapter "1.6.2"]])

(task-options! jar {:main 'ags799.mock-oauth2.main})

(require '[ags799.bootlaces :refer :all])

(bootlaces! 'ags799/mock-oauth2)
