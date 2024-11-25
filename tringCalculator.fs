module StringCalculator

let add (numbers: string) =
    match numbers with
    | "" -> 0
    | _ ->
        let parts = numbers.Split(',')
        parts |> Array.map int |> Array.sum

// Pruebas
printfn "%d" (add "")       // 0
printfn "%d" (add "1")      // 1
printfn "%d" (add "1,2")    // 3





















