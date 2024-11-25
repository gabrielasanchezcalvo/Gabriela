module StringCalculator

let add (numbers: string) =
    match numbers with
    | "" -> 0
    | _ ->
        let delimiters = [| ','; '\n' |]
        let parts = numbers.Split(delimiters) |> Array.map int
        parts |> Array.filter (fun x -> x <= 1000) |> Array.sum

// Pruebas
printfn "%d" (add "2,1001")   // 2
printfn "%d" (add "1000,1")   // 1001




















